/* Generated SBE (Simple Binary Encoding) message codec */
package sbe.msg;

public enum CancelOnDisconnectEnum
{
    DoNotCancel((short)0),
    Cancel((short)1),
    NULL_VAL((short)255);

    private final short value;

    CancelOnDisconnectEnum(final short value)
    {
        this.value = value;
    }

    public short value()
    {
        return value;
    }

    public static CancelOnDisconnectEnum get(final short value)
    {
        switch (value)
        {
            case 0: return DoNotCancel;
            case 1: return Cancel;
        }

        if ((short)255 == value)
        {
            return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}
