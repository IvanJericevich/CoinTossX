/* Generated SBE (Simple Binary Encoding) message codec */
package sbe.msg;

import uk.co.real_logic.sbe.codec.java.CodecUtil;
import uk.co.real_logic.agrona.MutableDirectBuffer;

@SuppressWarnings("all")
public class OrderCancelReplaceRequestEncoder
{
    public static final int BLOCK_LENGTH = 92;
    public static final int TEMPLATE_ID = 12;
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 0;

    private final OrderCancelReplaceRequestEncoder parentMessage = this;
    private MutableDirectBuffer buffer;
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

    public OrderCancelReplaceRequestEncoder wrap(final MutableDirectBuffer buffer, final int offset)
    {
        this.buffer = buffer;
        this.offset = offset;
        limit(offset + BLOCK_LENGTH);
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
    public OrderCancelReplaceRequestEncoder clientOrderId(final int value)
    {
        CodecUtil.int32Put(buffer, offset + 0, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public static int origClientOrderIdNullValue()
    {
        return -2147483648;
    }

    public static int origClientOrderIdMinValue()
    {
        return -2147483647;
    }

    public static int origClientOrderIdMaxValue()
    {
        return 2147483647;
    }
    public OrderCancelReplaceRequestEncoder origClientOrderId(final int value)
    {
        CodecUtil.int32Put(buffer, offset + 4, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public static int orderIdNullValue()
    {
        return -2147483648;
    }

    public static int orderIdMinValue()
    {
        return -2147483647;
    }

    public static int orderIdMaxValue()
    {
        return 2147483647;
    }
    public OrderCancelReplaceRequestEncoder orderId(final int value)
    {
        CodecUtil.int32Put(buffer, offset + 8, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
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
    public OrderCancelReplaceRequestEncoder securityId(final int value)
    {
        CodecUtil.int32Put(buffer, offset + 12, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
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

    public void traderMnemonic(final int index, final byte value)
    {
        if (index < 0 || index >= 17)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        CodecUtil.charPut(buffer, this.offset + 16 + (index * 1), value);
    }

    public static String traderMnemonicCharacterEncoding()
    {
        return "UTF-8";
    }
    public OrderCancelReplaceRequestEncoder putTraderMnemonic(final byte[] src, final int srcOffset)
    {
        final int length = 17;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("srcOffset out of range for copy: offset=" + srcOffset);
        }

        CodecUtil.charsPut(buffer, this.offset + 16, src, srcOffset, length);
        return this;
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

    public void account(final int index, final byte value)
    {
        if (index < 0 || index >= 10)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        CodecUtil.charPut(buffer, this.offset + 33 + (index * 1), value);
    }

    public static String accountCharacterEncoding()
    {
        return "UTF-8";
    }
    public OrderCancelReplaceRequestEncoder putAccount(final byte[] src, final int srcOffset)
    {
        final int length = 10;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("srcOffset out of range for copy: offset=" + srcOffset);
        }

        CodecUtil.charsPut(buffer, this.offset + 33, src, srcOffset, length);
        return this;
    }
    public OrderCancelReplaceRequestEncoder orderType(final OrdTypeEnum value)
    {
        CodecUtil.uint8Put(buffer, offset + 43, value.value());
        return this;
    }
    public OrderCancelReplaceRequestEncoder timeInForce(final TimeInForceEnum value)
    {
        CodecUtil.uint8Put(buffer, offset + 44, value.value());
        return this;
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

    public void expireTime(final int index, final byte value)
    {
        if (index < 0 || index >= 17)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        CodecUtil.charPut(buffer, this.offset + 45 + (index * 1), value);
    }

    public static String expireTimeCharacterEncoding()
    {
        return "UTF-8";
    }
    public OrderCancelReplaceRequestEncoder putExpireTime(final byte[] src, final int srcOffset)
    {
        final int length = 17;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("srcOffset out of range for copy: offset=" + srcOffset);
        }

        CodecUtil.charsPut(buffer, this.offset + 45, src, srcOffset, length);
        return this;
    }
    public OrderCancelReplaceRequestEncoder side(final SideEnum value)
    {
        CodecUtil.uint8Put(buffer, offset + 62, value.value());
        return this;
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
    public OrderCancelReplaceRequestEncoder orderQuantity(final int value)
    {
        CodecUtil.int32Put(buffer, offset + 63, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
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
    public OrderCancelReplaceRequestEncoder displayQuantity(final int value)
    {
        CodecUtil.int32Put(buffer, offset + 67, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
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
    public OrderCancelReplaceRequestEncoder minQuantity(final int value)
    {
        CodecUtil.int32Put(buffer, offset + 71, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    private final PriceEncoder limitPrice = new PriceEncoder();

    public PriceEncoder limitPrice()
    {
        limitPrice.wrap(buffer, offset + 75);
        return limitPrice;
    }

    private final PriceEncoder stopPrice = new PriceEncoder();

    public PriceEncoder stopPrice()
    {
        stopPrice.wrap(buffer, offset + 83);
        return stopPrice;
    }
    public OrderCancelReplaceRequestEncoder orderBook(final OrderBookEnum value)
    {
        CodecUtil.uint8Put(buffer, offset + 91, value.value());
        return this;
    }
}
