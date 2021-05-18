package vo;

import sbe.msg.marketData.SideEnum;
import util.CommonUtil;

import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class TradeVO implements Serializable {
    private int tradeId;
    private long clientOrderId;
    private int price;
    private int quantity;
    private long executedTime;
    private int traderMnemonic;
    private SideEnum side;

    public TradeVO(int tradeId,long clientOrderId,int price,int quantity,long executedTime, int traderMnemonic, SideEnum side){
        this.tradeId = tradeId;
        this.clientOrderId = clientOrderId;
        this.price = price;
        this.quantity = quantity;
        this.executedTime = executedTime;
        this.traderMnemonic = traderMnemonic;
        this.side = side;
    }

    public TradeVO(){}


    public int getTradeId() {
        return tradeId;
    }

    public void setTradeId(int tradeId) {
        this.tradeId = tradeId;
    }

    public long getClientOrderId() {
        return clientOrderId;
    }

    public void setClientOrderId(long clientOrderId) {
        this.clientOrderId = clientOrderId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public SideEnum getSide() {
        return side;
    }

    public void setSide(SideEnum side) {
        this.side = side;
    }

    public String getFormattedTime(){
        return CommonUtil.creationTimeFormatter.format(LocalDateTime.ofInstant(Instant.ofEpochMilli(executedTime), ZoneId.systemDefault()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TradeVO tradeVO = (TradeVO) o;

        return tradeId == tradeVO.tradeId;

    }

    @Override
    public int hashCode() {
        return tradeId;
    }

    @Override
    public String toString() {
        return tradeId + "," +
               clientOrderId + "," +
               price + "," +
               quantity + "," +
               getFormattedTime();
    }

    public Object[] getValues(){
        return new Object[]{getFormattedTime(),traderMnemonic,clientOrderId,price,quantity,side,"Trade"};
    }

    public static String[] getFileHeader(){
        return new String[]{"DateTime","TraderMnemonic","ClientOrderId","Price","Volume","Side","Type"};
    }

    public long getCreationTime() {
        return executedTime;
    }

    public void setExecutedTime(long executedTime) {
        this.executedTime = executedTime;
    }

    public int getTraderMnemonic() {
        return traderMnemonic;
    }

    public void setTraderMnemonic(int traderMnemonic) {
        this.traderMnemonic = traderMnemonic;
    }
}
