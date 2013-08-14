
package gwlpr.protocol.loginserver.inbound;

import gwlpr.protocol.serialization.GWMessage;


/**
 * Auto-generated by PacketCodeGen.
 * Update the character that we want to use to play
 * 
 */
public final class P010_CharacterPlayName
    extends GWMessage
{

    private long loginCount;
    private String characterName;

    @Override
    public short getHeader() {
        return  10;
    }

    public long getLoginCount() {
        return loginCount;
    }

    public String getCharacterName() {
        return characterName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P010_CharacterPlayName[");
        sb.append("loginCount=").append(this.loginCount).append(",characterName=").append(this.characterName.toString()).append("]");
        return sb.toString();
    }

}