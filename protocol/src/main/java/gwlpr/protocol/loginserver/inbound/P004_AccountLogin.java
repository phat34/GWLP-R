
package gwlpr.protocol.loginserver.inbound;

import java.util.Arrays;
import gwlpr.protocol.serialization.GWMessage;
import gwlpr.protocol.util.IsArray;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P004_AccountLogin
    extends GWMessage
{

    private long loginCount;
    private long unknown1;
    @IsArray(constant = true, size = 20, prefixLength = -1)
    private byte[] password;
    private String email;
    private String unknown2;
    private String characterName;

    @Override
    public short getHeader() {
        return  4;
    }

    public long getLoginCount() {
        return loginCount;
    }

    public long getUnknown1() {
        return unknown1;
    }

    public byte[] getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getUnknown2() {
        return unknown2;
    }

    public String getCharacterName() {
        return characterName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P004_AccountLogin[");
        sb.append("loginCount=").append(this.loginCount).append(",unknown1=").append(this.unknown1).append(",password=").append(Arrays.toString(this.password)).append(",email=").append(this.email.toString()).append(",unknown2=").append(this.unknown2 .toString()).append(",characterName=").append(this.characterName.toString()).append("]");
        return sb.toString();
    }

}
