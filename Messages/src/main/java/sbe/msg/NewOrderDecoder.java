/* Generated SBE (Simple Binary Encoding) message codec */
package sbe.msg;

import uk.co.real_logic.sbe.codec.java.CodecUtil;
import uk.co.real_logic.agrona.DirectBuffer;

@SuppressWarnings("all")
public class NewOrderDecoder
{
    public static final int BLOCK_LENGTH = 86;
    public static final int TEMPLATE_ID = 9;
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 0;

    private final NewOrderDecoder parentMessage = this;
    private DirectBuffer buffer;
    protected int offset;
    protected int limit;
    protected int actingBlockLength;
    protected int actingVersion;

    public int sbeBlockLength()
    {
        return BLOCK_LENGTH;
    }

    public int sbeTemplateId()
    {
        return TEMPLATE_ID;
    }

    public int sbeSchemaId()
    {
        return SCHEMA_ID;
    }

    public int sbeSchemaVersion()
    {
        return SCHEMA_VERSION;
    }

    public String sbeSemanticType()
    {
        return "";
    }

    public int offset()
    {
        return offset;
    }

    public NewOrderDecoder wrap(
        final DirectBuffer buffer, final int offset, final int actingBlockLength, final int actingVersion)
    {
        this.buffer = buffer;
        this.offset = offset;
        this.actingBlockLength = actingBlockLength;
        this.actingVersion = actingVersion;
        limit(offset + actingBlockLength);

        return this;
    }

    public int encodedLength()
    {
        return limit - offset;
    }

    public int limit()
    {
        return limit;
    }

    public void limit(final int limit)
    {
        buffer.checkLimit(limit);
        this.limit = limit;
    }

    public static int clientOrderIdId()
    {
        return 1;
    }

    public static String clientOrderIdMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public static int clientOrderIdNullValue()
    {
        return -2147483648;
    }

    public static int clientOrderIdMinValue()
    {
        return -2147483647;
    }

    public static int clientOrderIdMaxValue()
    {
        return 2147483647;
    }

    public int clientOrderId()
    {
        return CodecUtil.int32Get(buffer, offset + 0, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int securityIdId()
    {
        return 2;
    }

    public static String securityIdMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public static int securityIdNullValue()
    {
        return -2147483648;
    }

    public static int securityIdMinValue()
    {
        return -2147483647;
    }

    public static int securityIdMaxValue()
    {
        return 2147483647;
    }

    public int securityId()
    {
        return CodecUtil.int32Get(buffer, offset + 4, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int traderMnemonicId()
    {
        return 3;
    }

    public static String traderMnemonicMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public static byte traderMnemonicNullValue()
    {
        return (byte)0;
    }

    public static byte traderMnemonicMinValue()
    {
        return (byte)32;
    }

    public static byte traderMnemonicMaxValue()
    {
        return (byte)126;
    }

    public static int traderMnemonicLength()
    {
        return 17;
    }

    public byte traderMnemonic(final int index)
    {
        if (index < 0 || index >= 17)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        return CodecUtil.charGet(buffer, this.offset + 8 + (index * 1));
    }


    public static String traderMnemonicCharacterEncoding()
    {
        return "UTF-8";
    }

    public int getTraderMnemonic(final byte[] dst, final int dstOffset)
    {
        final int length = 17;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("dstOffset out of range for copy: offset=" + dstOffset);
        }

        CodecUtil.charsGet(buffer, this.offset + 8, dst, dstOffset, length);
        return length;
    }


    public static int accountId()
    {
        return 4;
    }

    public static String accountMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public static byte accountNullValue()
    {
        return (byte)0;
    }

    public static byte accountMinValue()
    {
        return (byte)32;
    }

    public static byte accountMaxValue()
    {
        return (byte)126;
    }

    public static int accountLength()
    {
        return 10;
    }

    public byte account(final int index)
    {
        if (index < 0 || index >= 10)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        return CodecUtil.charGet(buffer, this.offset + 25 + (index * 1));
    }


    public static String accountCharacterEncoding()
    {
        return "UTF-8";
    }

    public int getAccount(final byte[] dst, final int dstOffset)
    {
        final int length = 10;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("dstOffset out of range for copy: offset=" + dstOffset);
        }

        CodecUtil.charsGet(buffer, this.offset + 25, dst, dstOffset, length);
        return length;
    }


    public static int orderTypeId()
    {
        return 5;
    }

    public static String orderTypeMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public OrdTypeEnum orderType()
    {
        return OrdTypeEnum.get(CodecUtil.uint8Get(buffer, offset + 35));
    }


    public static int timeInForceId()
    {
        return 6;
    }

    public static String timeInForceMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public TimeInForceEnum timeInForce()
    {
        return TimeInForceEnum.get(CodecUtil.uint8Get(buffer, offset + 36));
    }


    public static int expireTimeId()
    {
        return 7;
    }

    public static String expireTimeMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public static byte expireTimeNullValue()
    {
        return (byte)0;
    }

    public static byte expireTimeMinValue()
    {
        return (byte)32;
    }

    public static byte expireTimeMaxValue()
    {
        return (byte)126;
    }

    public static int expireTimeLength()
    {
        return 17;
    }

    public byte expireTime(final int index)
    {
        if (index < 0 || index >= 17)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        return CodecUtil.charGet(buffer, this.offset + 37 + (index * 1));
    }


    public static String expireTimeCharacterEncoding()
    {
        return "UTF-8";
    }

    public int getExpireTime(final byte[] dst, final int dstOffset)
    {
        final int length = 17;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("dstOffset out of range for copy: offset=" + dstOffset);
        }

        CodecUtil.charsGet(buffer, this.offset + 37, dst, dstOffset, length);
        return length;
    }


    public static int sideId()
    {
        return 8;
    }

    public static String sideMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public SideEnum side()
    {
        return SideEnum.get(CodecUtil.uint8Get(buffer, offset + 54));
    }


    public static int orderQuantityId()
    {
        return 9;
    }

    public static String orderQuantityMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public static int orderQuantityNullValue()
    {
        return -2147483648;
    }

    public static int orderQuantityMinValue()
    {
        return -2147483647;
    }

    public static int orderQuantityMaxValue()
    {
        return 2147483647;
    }

    public int orderQuantity()
    {
        return CodecUtil.int32Get(buffer, offset + 55, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int displayQuantityId()
    {
        return 10;
    }

    public static String displayQuantityMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public static int displayQuantityNullValue()
    {
        return -2147483648;
    }

    public static int displayQuantityMinValue()
    {
        return -2147483647;
    }

    public static int displayQuantityMaxValue()
    {
        return 2147483647;
    }

    public int displayQuantity()
    {
        return CodecUtil.int32Get(buffer, offset + 59, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int minQuantityId()
    {
        return 11;
    }

    public static String minQuantityMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public static int minQuantityNullValue()
    {
        return -2147483648;
    }

    public static int minQuantityMinValue()
    {
        return -2147483647;
    }

    public static int minQuantityMaxValue()
    {
        return 2147483647;
    }

    public int minQuantity()
    {
        return CodecUtil.int32Get(buffer, offset + 63, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int limitPriceId()
    {
        return 12;
    }

    public static String limitPriceMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    private final PriceDecoder limitPrice = new PriceDecoder();

    public PriceDecoder limitPrice()
    {
        limitPrice.wrap(buffer, offset + 67);
        return limitPrice;
    }

    public static int stopPriceId()
    {
        return 13;
    }

    public static String stopPriceMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    private final PriceDecoder stopPrice = new PriceDecoder();

    public PriceDecoder stopPrice()
    {
        stopPrice.wrap(buffer, offset + 75);
        return stopPrice;
    }

    public static int capacityId()
    {
        return 14;
    }

    public static String capacityMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public CapacityEnum capacity()
    {
        return CapacityEnum.get(CodecUtil.uint8Get(buffer, offset + 83));
    }


    public static int cancelOnDisconnectId()
    {
        return 12;
    }

    public static String cancelOnDisconnectMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public CancelOnDisconnectEnum cancelOnDisconnect()
    {
        return CancelOnDisconnectEnum.get(CodecUtil.uint8Get(buffer, offset + 84));
    }


    public static int orderBookId()
    {
        return 13;
    }

    public static String orderBookMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public OrderBookEnum orderBook()
    {
        return OrderBookEnum.get(CodecUtil.uint8Get(buffer, offset + 85));
    }

}
