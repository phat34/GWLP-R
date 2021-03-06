
package gwlpr.protocol.gameserver.inbound;

import java.util.Arrays;
import gwlpr.protocol.serialization.GWMessage;
import gwlpr.protocol.util.IsArray;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P184_Unknown
    extends GWMessage
{

    private long unknown1;
    @IsArray(constant = true, size = 16, prefixLength = -1)
    private byte[] unknown2;
    private short unknown3;

    @Override
    public short getHeader() {
        return  184;
    }

    public long getUnknown1() {
        return unknown1;
    }

    public byte[] getUnknown2() {
        return unknown2;
    }

    public short getUnknown3() {
        return unknown3;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P184_Unknown[");
        sb.append("unknown1=").append(this.unknown1).append(",unknown2=").append(Arrays.toString(this.unknown2)).append(",unknown3=").append(this.unknown3).append("]");
        return sb.toString();
    }

}
