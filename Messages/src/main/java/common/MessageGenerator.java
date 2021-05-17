package common;

import sbe.builder.*;
import sbe.msg.*;
import uk.co.real_logic.agrona.DirectBuffer;

public class MessageGenerator {

    public static DirectBuffer buildLogonRequest(){
        LogonBuilder logonBuilder = new LogonBuilder();
        return logonBuilder.compID(1)
                .password("password12".getBytes())
                .newPassword("1234567890".getBytes())
                .build();
    }

    public static DirectBuffer buildLogonResponse(){
        LogonResponseBuilder logonResponseBuilder = new LogonResponseBuilder();
        return logonResponseBuilder.compID(1)
                .rejectCode(RejectCode.LoginSuccessful)
                .passwordExpiry(1)
                .build();
    }

    public static DirectBuffer buildOrderCancelRequest() {
        OrderCancelRequestBuilder orderCancelRequestBuilder = new OrderCancelRequestBuilder();
        orderCancelRequestBuilder.compID(1);
        orderCancelRequestBuilder.clientOrderId(2);
        orderCancelRequestBuilder.origClientOrderId(1);
        orderCancelRequestBuilder.securityId(1);
        String trader = BuilderUtil.fill("John", OrderCancelRequestEncoder.traderMnemonicLength());
        orderCancelRequestBuilder.traderMnemonic(trader.getBytes())
                .side(SideEnum.Buy)
                .orderBook(OrderBookEnum.Regular);

        return orderCancelRequestBuilder.build();
    }

    public static DirectBuffer buildOrderCancelRequestInvalidSecurity() {
        OrderCancelRequestBuilder orderCancelRequestBuilder = new OrderCancelRequestBuilder();
        orderCancelRequestBuilder.compID(1);
        orderCancelRequestBuilder.clientOrderId(2);
        orderCancelRequestBuilder.origClientOrderId(1);
        orderCancelRequestBuilder.securityId(99);
        String trader = BuilderUtil.fill("John", OrderCancelRequestEncoder.traderMnemonicLength());
        orderCancelRequestBuilder.traderMnemonic(trader.getBytes())
                .side(SideEnum.Buy)
                .orderBook(OrderBookEnum.Regular);
        return orderCancelRequestBuilder.build();
    }

    public static DirectBuffer buildOrderCancelReplaceRequest() {
        OrderCancelReplaceRequestBuilder orderCancelReplaceRequestBuilder = new OrderCancelReplaceRequestBuilder();
        orderCancelReplaceRequestBuilder.compID(1);
        orderCancelReplaceRequestBuilder.clientOrderId(2);
        orderCancelReplaceRequestBuilder.origClientOrderId(1);
        orderCancelReplaceRequestBuilder.securityId(1);
        String trader = BuilderUtil.fill("John", OrderCancelReplaceRequestEncoder.traderMnemonicLength());
        orderCancelReplaceRequestBuilder.traderMnemonic(trader.getBytes());
        String account = BuilderUtil.fill("test", OrderCancelReplaceRequestEncoder.accountLength());
        orderCancelReplaceRequestBuilder.account(account.getBytes());
        orderCancelReplaceRequestBuilder.orderType(OrdTypeEnum.Limit)
                .timeInForce(TimeInForceEnum.Day)
                .expireTime("20150823-10:00:00".getBytes())
                .side(SideEnum.Buy)
                .orderQuantity(1000)
                .displayQuantity(1000)
                .minQuantity(0)
                .limitPrice(10000)
                .stopPrice(0)
                .orderBook(OrderBookEnum.Regular);
        return orderCancelReplaceRequestBuilder.build();
    }

    public static DirectBuffer buildLimitOrder() {
        String traderMnemonic = BuilderUtil.fill("John", NewOrderEncoder.traderMnemonicLength());
        NewOrderBuilder newOrderBuilder = new NewOrderBuilder().compID(1)
                .clientOrderId(2)
                .securityId(1)
                .orderType(OrdTypeEnum.Limit)
                .timeInForce(TimeInForceEnum.Day)
                .side(SideEnum.Buy)
                .account("account123".getBytes())
                .capacity(CapacityEnum.Agency)
                .cancelOnDisconnect(CancelOnDisconnectEnum.DoNotCancel)
                .orderBook(OrderBookEnum.Regular)
                .traderMnemonic(traderMnemonic.getBytes())
                .expireTime("20211230-23:00:00".getBytes())
                .orderQuantity(1000)
                .displayQuantity(1000)
                .minQuantity(0)
                .limitPrice(10000)
                .stopPrice(0);
        return newOrderBuilder.build();
    }
}
