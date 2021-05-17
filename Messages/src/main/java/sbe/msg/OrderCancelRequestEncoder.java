/* Generated SBE (Simple Binary Encoding) message codec */
package sbe.msg;

import uk.co.real_logic.sbe.codec.java.CodecUtil;
import uk.co.real_logic.agrona.MutableDirectBuffer;

@SuppressWarnings("all")
public class OrderCancelRequestEncoder
{
    public static final int BLOCK_LENGTH = 43;
    public static final int TEMPLATE_ID = 10;
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 0;

    private final OrderCancelRequestEncoder parentMessage = this;
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

    public OrderCancelRequestEncoder wrap(final MutableDirectBuffer buffer, final int offset)
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
    public OrderCancelRequestEncoder clientOrderId(final int value)
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
    public OrderCancelRequestEncoder origClientOrderId(final int value)
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
    public OrderCancelRequestEncoder orderId(final int value)
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
    public OrderCancelRequestEncoder securityId(final int value)
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
    public OrderCancelRequestEncoder putTraderMnemonic(final byte[] src, final int srcOffset)
    {
        final int length = 17;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("srcOffset out of range for copy: offset=" + srcOffset);
        }

        CodecUtil.charsPut(buffer, this.offset + 16, src, srcOffset, length);
        return this;
    }
    public OrderCancelRequestEncoder side(final SideEnum value)
    {
        CodecUtil.uint8Put(buffer, offset + 33, value.value());
        return this;
    }
    public OrderCancelRequestEncoder orderBook(final OrderBookEnum value)
    {
        CodecUtil.uint8Put(buffer, offset + 34, value.value());
        return this;
    }

    private final PriceEncoder limitPrice = new PriceEncoder();

    public PriceEncoder limitPrice()
    {
        limitPrice.wrap(buffer, offset + 35);
        return limitPrice;
    }
}
