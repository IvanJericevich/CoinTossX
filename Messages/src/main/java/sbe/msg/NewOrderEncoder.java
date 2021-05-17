/* Generated SBE (Simple Binary Encoding) message codec */
package sbe.msg;

import uk.co.real_logic.sbe.codec.java.CodecUtil;
import uk.co.real_logic.agrona.MutableDirectBuffer;

@SuppressWarnings("all")
public class NewOrderEncoder
{
    public static final int BLOCK_LENGTH = 86;
    public static final int TEMPLATE_ID = 9;
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 0;

    private final NewOrderEncoder parentMessage = this;
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

    public NewOrderEncoder wrap(final MutableDirectBuffer buffer, final int offset)
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
    public NewOrderEncoder clientOrderId(final int value)
    {
        CodecUtil.int32Put(buffer, offset + 0, value, java.nio.ByteOrder.LITTLE_ENDIAN);
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
    public NewOrderEncoder securityId(final int value)
    {
        CodecUtil.int32Put(buffer, offset + 4, value, java.nio.ByteOrder.LITTLE_ENDIAN);
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

        CodecUtil.charPut(buffer, this.offset + 8 + (index * 1), value);
    }

    public static String traderMnemonicCharacterEncoding()
    {
        return "UTF-8";
    }
    public NewOrderEncoder putTraderMnemonic(final byte[] src, final int srcOffset)
    {
        final int length = 17;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("srcOffset out of range for copy: offset=" + srcOffset);
        }

        CodecUtil.charsPut(buffer, this.offset + 8, src, srcOffset, length);
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

        CodecUtil.charPut(buffer, this.offset + 25 + (index * 1), value);
    }

    public static String accountCharacterEncoding()
    {
        return "UTF-8";
    }
    public NewOrderEncoder putAccount(final byte[] src, final int srcOffset)
    {
        final int length = 10;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("srcOffset out of range for copy: offset=" + srcOffset);
        }

        CodecUtil.charsPut(buffer, this.offset + 25, src, srcOffset, length);
        return this;
    }
    public NewOrderEncoder orderType(final OrdTypeEnum value)
    {
        CodecUtil.uint8Put(buffer, offset + 35, value.value());
        return this;
    }
    public NewOrderEncoder timeInForce(final TimeInForceEnum value)
    {
        CodecUtil.uint8Put(buffer, offset + 36, value.value());
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

        CodecUtil.charPut(buffer, this.offset + 37 + (index * 1), value);
    }

    public static String expireTimeCharacterEncoding()
    {
        return "UTF-8";
    }
    public NewOrderEncoder putExpireTime(final byte[] src, final int srcOffset)
    {
        final int length = 17;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("srcOffset out of range for copy: offset=" + srcOffset);
        }

        CodecUtil.charsPut(buffer, this.offset + 37, src, srcOffset, length);
        return this;
    }
    public NewOrderEncoder side(final SideEnum value)
    {
        CodecUtil.uint8Put(buffer, offset + 54, value.value());
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
    public NewOrderEncoder orderQuantity(final int value)
    {
        CodecUtil.int32Put(buffer, offset + 55, value, java.nio.ByteOrder.LITTLE_ENDIAN);
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
    public NewOrderEncoder displayQuantity(final int value)
    {
        CodecUtil.int32Put(buffer, offset + 59, value, java.nio.ByteOrder.LITTLE_ENDIAN);
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
    public NewOrderEncoder minQuantity(final int value)
    {
        CodecUtil.int32Put(buffer, offset + 63, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    private final PriceEncoder limitPrice = new PriceEncoder();

    public PriceEncoder limitPrice()
    {
        limitPrice.wrap(buffer, offset + 67);
        return limitPrice;
    }

    private final PriceEncoder stopPrice = new PriceEncoder();

    public PriceEncoder stopPrice()
    {
        stopPrice.wrap(buffer, offset + 75);
        return stopPrice;
    }
    public NewOrderEncoder capacity(final CapacityEnum value)
    {
        CodecUtil.uint8Put(buffer, offset + 83, value.value());
        return this;
    }
    public NewOrderEncoder cancelOnDisconnect(final CancelOnDisconnectEnum value)
    {
        CodecUtil.uint8Put(buffer, offset + 84, value.value());
        return this;
    }
    public NewOrderEncoder orderBook(final OrderBookEnum value)
    {
        CodecUtil.uint8Put(buffer, offset + 85, value.value());
        return this;
    }
}
