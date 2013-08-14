
package gwlpr.protocol.gameserver.outbound;

import gwlpr.protocol.serialization.GWMessage;


/**
 * Auto-generated by PacketCodeGen.
 * Might be send if something went wrong during char
 * creation.
 * 
 */
public final class P381_CharacterCreateError
    extends GWMessage
{

    /**
     * 
     * One of the known error codes. See the official
     * wiki. (Or look for an errorcode enum)
     * 
     */
    private long erroCode;

    @Override
    public short getHeader() {
        return  381;
    }

    public void setErroCode(long erroCode) {
        this.erroCode = erroCode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P381_CharacterCreateError[");
        sb.append("erroCode=").append(this.erroCode).append("]");
        return sb.toString();
    }

}
