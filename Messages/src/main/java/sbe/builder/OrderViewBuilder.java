package sbe.builder;

import sbe.msg.MessageHeaderEncoder;
import sbe.msg.OrderCancelRequestEncoder;
import sbe.msg.OrderViewEncoder;
import sbe.msg.SideEnum;
import uk.co.real_logic.agrona.DirectBuffer;
import uk.co.real_logic.agrona.concurrent.UnsafeBuffer;

import java.nio.ByteBuffer;

public class OrderViewBuilder {
    private int bufferIndex;
    private OrderViewEncoder orderView;
    private MessageHeaderEncoder messageHeader;
    private UnsafeBuffer encodeBuffer;

    private int compID;
    private int securityId;
    private int orderId;
    private int clientOrderId;
    private long submittedTime;
    private SideEnum side;
    private long price;
    private int orderQuantity;
    private int traderMnemonic;

    public static int BUFFER_SIZE = 106;

    public OrderViewBuilder(){
        orderView = new OrderViewEncoder();
        messageHeader = new MessageHeaderEncoder();
        encodeBuffer = new UnsafeBuffer(ByteBuffer.allocateDirect(BUFFER_SIZE));
    }

    public void reset(){
        compID = 0;
        orderId = 0;
    }

    public OrderViewBuilder compID(int value){
        this.compID = value;
        return this;
    }

    public OrderViewBuilder securityId(int value){
        this.securityId = value;
        return this;
    }

    public OrderViewBuilder orderId(int value){
        this.orderId = value;
        return this;
    }

    public OrderViewBuilder clientOrderId(int value){
        this.clientOrderId = value;
        return this;
    }

    public OrderViewBuilder submittedTime(long value){
        this.submittedTime = value;
        return this;
    }

    public OrderViewBuilder side(SideEnum value){
        this.side = value;
        return this;
    }

    public OrderViewBuilder price(long value){
        this.price = value;
        return this;
    }

    public OrderViewBuilder orderQuantity(int value){
        this.orderQuantity = value;
        return this;
    }

    public OrderViewBuilder traderMnemonic(int value){
        this.traderMnemonic = value;
        return this;
    }

    public DirectBuffer build(){
        if(orderId == 0){
            return null;
        }

        bufferIndex = 0;
        messageHeader.wrap(encodeBuffer, bufferIndex)
                .blockLength(orderView.sbeBlockLength())
                .templateId(orderView.sbeTemplateId())
                .schemaId(orderView.sbeSchemaId())
                .version(orderView.sbeSchemaVersion())
                .compID(compID);

        bufferIndex += messageHeader.encodedLength();
        orderView.wrap(encodeBuffer, bufferIndex);

        orderView.securityId(securityId);
        orderView.orderId(orderId);
        orderView.clientOrderId(clientOrderId);

        orderView.submittedTime(submittedTime);
        orderView.side(side);
        orderView.price().mantissa(price);

        orderView.orderQuantity(orderQuantity);
        orderView.traderMnemonic(traderMnemonic);

        return encodeBuffer;
    }

}
