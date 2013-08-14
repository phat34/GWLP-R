
package gwlpr.protocol.gameserver.outbound;

import gwlpr.protocol.serialization.GWMessage;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P202_Unknown
    extends GWMessage
{

    private int unknown1;
    private int unknown2;
    private long unknown3;

    @Override
    public short getHeader() {
        return  202;
    }

    public void setUnknown1(int unknown1) {
        this.unknown1 = unknown1;
    }

    public void setUnknown2(int unknown2) {
        this.unknown2 = unknown2;
    }

    public void setUnknown3(long unknown3) {
        this.unknown3 = unknown3;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P202_Unknown[");
        sb.append("unknown1=").append(this.unknown1).append(",unknown2=").append(this.unknown2).append(",unknown3=").append(this.unknown3).append("]");
        return sb.toString();
    }

}