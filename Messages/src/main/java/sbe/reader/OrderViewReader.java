package sbe.reader;

import sbe.msg.MessageHeaderDecoder;
import sbe.msg.OrderViewDecoder;
import sbe.msg.SideEnum;
import uk.co.real_logic.agrona.DirectBuffer;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;

public class OrderViewReader implements Serializable {
    private int bufferIndex;
    private OrderViewDecoder orderView;
    private MessageHeaderDecoder messageHeader;

    private int compID;
    private int securityId;
    private int orderId;
    private int clientOrderId;
    private long submittedTime;
    private SideEnum side;
    private long price;
    private int orderQuantity;
    private int traderMnemonic;

    public OrderViewReader(){
        bufferIndex = 0;
        orderView = new OrderViewDecoder();
        messageHeader = new MessageHeaderDecoder();
    }

    public void read(DirectBuffer buffer) throws UnsupportedEncodingException {
        bufferIndex = 0;
        messageHeader = messageHeader.wrap(buffer, bufferIndex);

        int actingBlockLength = messageHeader.blockLength();
        int actingVersion = messageHeader.version();
        compID = messageHeader.compID();
        bufferIndex += messageHeader.encodedLength();

        orderView.wrap(buffer, bufferIndex, actingBlockLength, actingVersion);

        securityId = orderView.securityId();
        orderId = orderView.orderId();
        clientOrderId = orderView.clientOrderId();
        submittedTime = orderView.submittedTime();
        side = orderView.side();
        price = orderView.price().mantissa();
        orderQuantity = orderView.orderQuantity();
        traderMnemonic = orderView.traderMnemonic();
    }

    public int getCompID() {
        return compID;
    }

    public int getSecurityId() {
        return securityId;
    }

    public int getOrderId() {
        return orderId;
    }

    public int getClientOrderId() {
        return clientOrderId;
    }

    public long getSubmittedTime() {
        return submittedTime;
    }

    public SideEnum getSide() {
        return side;
    }

    public long getPrice() {
        return price;
    }

    public int getOrderQuantity() {
        return orderQuantity;
    }

    public int getTraderMnemonic() {
        return traderMnemonic;
    }
}
