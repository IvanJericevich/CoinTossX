/* Generated SBE (Simple Binary Encoding) message codec */
package sbe.msg;

import uk.co.real_logic.sbe.codec.java.CodecUtil;
import uk.co.real_logic.agrona.MutableDirectBuffer;
import uk.co.real_logic.sbe.codec.java.GroupOrder;

@GroupOrder({LOBEncoder.OrdersEncoder.class})
@SuppressWarnings("all")
public class LOBEncoder
{
    public static final int BLOCK_LENGTH = 4;
    public static final int TEMPLATE_ID = 94;
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 0;

    private final LOBEncoder parentMessage = this;
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

    public LOBEncoder wrap(final MutableDirectBuffer buffer, final int offset)
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
    public LOBEncoder securityId(final int value)
    {
        CodecUtil.int32Put(buffer, offset + 0, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    private final OrdersEncoder orders = new OrdersEncoder();

    public static long ordersId()
    {
        return 2;
    }

    public OrdersEncoder ordersCount(final int count)
    {
        orders.wrap(parentMessage, buffer, count);
        return orders;
    }

    public static class OrdersEncoder
    {
        private static final int HEADER_SIZE = 8;
        private final OrderGroupEncoder dimensions = new OrderGroupEncoder();
        private LOBEncoder parentMessage;
        private MutableDirectBuffer buffer;
        private int blockLength;
        private int actingVersion;
        private int count;
        private int index;
        private int offset;

        public void wrap(final LOBEncoder parentMessage, final MutableDirectBuffer buffer, final int count)
        {
            this.parentMessage = parentMessage;
            this.buffer = buffer;
            actingVersion = SCHEMA_VERSION;
            dimensions.wrap(buffer, parentMessage.limit());
            dimensions.blockLength((int)21);
            dimensions.numInGroup((int)count);
            index = -1;
            this.count = count;
            blockLength = 21;
            parentMessage.limit(parentMessage.limit() + HEADER_SIZE);
        }

        public static int sbeHeaderSize()
        {
            return HEADER_SIZE;
        }

        public static int sbeBlockLength()
        {
            return 21;
        }

        public OrdersEncoder next()
        {
            if (index + 1 >= count)
            {
                throw new java.util.NoSuchElementException();
            }

            offset = parentMessage.limit();
            parentMessage.limit(offset + blockLength);
            ++index;

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
        public OrdersEncoder orderId(final int value)
        {
            CodecUtil.int32Put(buffer, offset + 0, value, java.nio.ByteOrder.LITTLE_ENDIAN);
            return this;
        }

        private final PriceEncoder price = new PriceEncoder();

        public PriceEncoder price()
        {
            price.wrap(buffer, offset + 4);
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
        public OrdersEncoder orderQuantity(final int value)
        {
            CodecUtil.int32Put(buffer, offset + 12, value, java.nio.ByteOrder.LITTLE_ENDIAN);
            return this;
        }
        public OrdersEncoder side(final SideEnum value)
        {
            CodecUtil.uint8Put(buffer, offset + 16, value.value());
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
        public OrdersEncoder clientOrderId(final int value)
        {
            CodecUtil.int32Put(buffer, offset + 17, value, java.nio.ByteOrder.LITTLE_ENDIAN);
            return this;
        }
    }
}
