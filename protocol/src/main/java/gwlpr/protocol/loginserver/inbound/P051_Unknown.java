
package gwlpr.protocol.loginserver.inbound;

import gwlpr.protocol.serialization.GWMessage;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P051_Unknown
    extends GWMessage
{

    private long unknown1;
    private long unknown2;
    private long unknown3;
    private long unknown4;
    private String unknown5;

    @Override
    public short getHeader() {
        return  51;
    }

    public long getUnknown1() {
        return unknown1;
    }

    public long getUnknown2() {
        return unknown2;
    }

    public long getUnknown3() {
        return unknown3;
    }

    public long getUnknown4() {
        return unknown4;
    }

    public String getUnknown5() {
        return unknown5;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P051_Unknown[");
        sb.append("unknown1=").append(this.unknown1).append(",unknown2=").append(this.unknown2).append(",unknown3=").append(this.unknown3).append(",unknown4=").append(this.unknown4).append(",unknown5=").append(this.unknown5 .toString()).append("]");
        return sb.toString();
    }

}