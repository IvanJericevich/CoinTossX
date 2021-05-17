/* Generated SBE (Simple Binary Encoding) message codec */
package sbe.msg;

import uk.co.real_logic.sbe.codec.java.CodecUtil;
import uk.co.real_logic.agrona.MutableDirectBuffer;

@SuppressWarnings("all")
public class OrderMassCancelReportEncoder
{
    public static final int BLOCK_LENGTH = 23;
    public static final int TEMPLATE_ID = 15;
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 0;

    private final OrderMassCancelReportEncoder parentMessage = this;
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

    public OrderMassCancelReportEncoder wrap(final MutableDirectBuffer buffer, final int offset)
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

    public static short partitionIdNullValue()
    {
        return (short)255;
    }

    public static short partitionIdMinValue()
    {
        return (short)0;
    }

    public static short partitionIdMaxValue()
    {
        return (short)254;
    }
    public OrderMassCancelReportEncoder partitionId(final short value)
    {
        CodecUtil.uint8Put(buffer, offset + 0, value);
        return this;
    }

    public static int sequenceNumberNullValue()
    {
        return -2147483648;
    }

    public static int sequenceNumberMinValue()
    {
        return -2147483647;
    }

    public static int sequenceNumberMaxValue()
    {
        return 2147483647;
    }
    public OrderMassCancelReportEncoder sequenceNumber(final int value)
    {
        CodecUtil.int32Put(buffer, offset + 1, value, java.nio.ByteOrder.LITTLE_ENDIAN);
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
    public OrderMassCancelReportEncoder clientOrderId(final int value)
    {
        CodecUtil.int32Put(buffer, offset + 5, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }
    public OrderMassCancelReportEncoder status(final OrderMassCancelReportStatusEnum value)
    {
        CodecUtil.uint8Put(buffer, offset + 9, value.value());
        return this;
    }
    public OrderMassCancelReportEncoder rejectCode(final RejectCode value)
    {
        CodecUtil.int32Put(buffer, offset + 10, value.value(), java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public static long transactTimeNullValue()
    {
        return 0xffffffffffffffffL;
    }

    public static long transactTimeMinValue()
    {
        return 0x0L;
    }

    public static long transactTimeMaxValue()
    {
        return 0xfffffffffffffffeL;
    }
    public OrderMassCancelReportEncoder transactTime(final long value)
    {
        CodecUtil.uint64Put(buffer, offset + 14, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }
    public OrderMassCancelReportEncoder orderBook(final OrderBookEnum value)
    {
        CodecUtil.uint8Put(buffer, offset + 22, value.value());
        return this;
    }
}
