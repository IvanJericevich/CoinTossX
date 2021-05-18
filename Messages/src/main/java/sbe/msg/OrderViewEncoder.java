/* Generated SBE (Simple Binary Encoding) message codec */
package sbe.msg;

import uk.co.real_logic.sbe.codec.java.*;
import uk.co.real_logic.agrona.MutableDirectBuffer;

@SuppressWarnings("all")
public class OrderViewEncoder
{
    public static final int BLOCK_LENGTH = 38;
    public static final int TEMPLATE_ID = 93;
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 0;

    private final OrderViewEncoder parentMessage = this;
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

    public OrderViewEncoder wrap(final MutableDirectBuffer buffer, final int offset)
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
    public OrderViewEncoder securityId(final int value)
    {
        CodecUtil.int32Put(buffer, offset + 0, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
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
    public OrderViewEncoder clientOrderId(final int value)
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
    public OrderViewEncoder orderId(final int value)
    {
        CodecUtil.int32Put(buffer, offset + 8, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public static long submittedTimeNullValue()
    {
        return 0xffffffffffffffffL;
    }

    public static long submittedTimeMinValue()
    {
        return 0x0L;
    }

    public static long submittedTimeMaxValue()
    {
        return 0xfffffffffffffffeL;
    }
    public OrderViewEncoder submittedTime(final long value)
    {
        CodecUtil.uint64Put(buffer, offset + 12, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    private final PriceEncoder price = new PriceEncoder();

    public PriceEncoder price()
    {
        price.wrap(buffer, offset + 20);
        return price;
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
    public OrderViewEncoder orderQuantity(final int value)
    {
        CodecUtil.int32Put(buffer, offset + 28, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }
    public OrderViewEncoder side(final SideEnum value)
    {
        CodecUtil.uint8Put(buffer, offset + 32, value.value());
        return this;
    }

    public static int traderMnemonicNullValue()
    {
        return -2147483648;
    }

    public static int traderMnemonicMinValue()
    {
        return -2147483647;
    }

    public static int traderMnemonicMaxValue()
    {
        return 2147483647;
    }
    public OrderViewEncoder traderMnemonic(final int value)
    {
        CodecUtil.int32Put(buffer, offset + 33, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }
    public OrderViewEncoder executionType(final ExecutionTypeEnum value)
    {
        CodecUtil.charPut(buffer, offset + 37, value.value());
        return this;
    }
}
