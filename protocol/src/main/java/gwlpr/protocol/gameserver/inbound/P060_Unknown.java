
package gwlpr.protocol.gameserver.inbound;

import gwlpr.protocol.serialization.GWMessage;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P060_Unknown
    extends GWMessage
{

    private short unknown1;

    @Override
    public short getHeader() {
        return  60;
    }

    public short getUnknown1() {
        return unknown1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P060_Unknown[");
        sb.append("unknown1=").append(this.unknown1).append("]");
        return sb.toString();
    }

}
