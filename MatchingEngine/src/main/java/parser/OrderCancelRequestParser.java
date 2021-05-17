package parser;

import dao.TraderDAO;
import data.ExecutionReportData;
import leafNode.OrderEntry;
import sbe.msg.OrderCancelRequestDecoder;
import uk.co.real_logic.agrona.DirectBuffer;

import java.io.UnsupportedEncodingException;

public class OrderCancelRequestParser {
    private OrderCancelRequestDecoder orderCancelRequest = new OrderCancelRequestDecoder();
    private int securityId;
    private byte[] traderMnemonic = new byte[OrderCancelRequestDecoder.traderMnemonicLength()];

    public void decode(DirectBuffer buffer, OrderEntry orderEntry,int bufferOffset,int actingBlockLength,int actingVersion) throws UnsupportedEncodingException {
        orderCancelRequest.wrap(buffer, bufferOffset, actingBlockLength, actingVersion);

        orderEntry.setOrderId(orderCancelRequest.orderId());
        securityId = orderCancelRequest.securityId();
        String traderName = new  String(traderMnemonic, 0, orderCancelRequest.getTraderMnemonic(traderMnemonic, 0), OrderCancelRequestDecoder.traderMnemonicCharacterEncoding()).trim();
        orderEntry.setTrader(TraderDAO.getTrader(traderName));
        orderEntry.setOrigClientOrderId(orderCancelRequest.origClientOrderId());
        orderEntry.setClientOrderId(orderCancelRequest.clientOrderId());
        orderEntry.setSide((byte) orderCancelRequest.side().value());
        orderEntry.setPrice(orderCancelRequest.limitPrice().mantissa());

        populateExecutionData();
    }

    public int getSecurityId(){
        return securityId;
    }

    private void populateExecutionData(){
        ExecutionReportData executionReportData = ExecutionReportData.INSTANCE;
        executionReportData.setClientOrderId(orderCancelRequest.clientOrderId());
    }
}
