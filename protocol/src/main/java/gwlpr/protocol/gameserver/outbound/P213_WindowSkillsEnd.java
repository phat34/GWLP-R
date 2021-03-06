
package gwlpr.protocol.gameserver.outbound;

import gwlpr.protocol.serialization.GWMessage;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P213_WindowSkillsEnd
    extends GWMessage
{

    private short windowType;

    @Override
    public short getHeader() {
        return  213;
    }

    public void setWindowType(short windowType) {
        this.windowType = windowType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P213_WindowSkillsEnd[");
        sb.append("windowType=").append(this.windowType).append("]");
        return sb.toString();
    }

}
