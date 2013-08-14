
package gwlpr.protocol.gameserver.inbound;

import gwlpr.protocol.serialization.GWMessage;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P100_Unknown
    extends GWMessage
{

    private long unknown1;
    private short unknown2;

    @Override
    public short getHeader() {
        return  100;
    }

    public long getUnknown1() {
        return unknown1;
    }

    public short getUnknown2() {
        return unknown2;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P100_Unknown[");
        sb.append("unknown1=").append(this.unknown1).append(",unknown2=").append(this.unknown2).append("]");
        return sb.toString();
    }

}
