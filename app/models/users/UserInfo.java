package models.users;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.jongo.marshall.jackson.oid.MongoId;
import org.jongo.marshall.jackson.oid.MongoObjectId;
import services.utils.JacksonFactory;

/**
 * Created by apple on 16/4/11.
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserInfo {

    @MongoId
    @MongoObjectId
    private String _id;
    private String codeUser;

    private String nameZhUser;
//    @Constraints.Email
    private String emailUser;
//    @Constraints.Required
    private String pwdUser;

    private String phoneUser;

    private String telUser;


    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    /**
     * @return Detailed code information.
     */

    public String getCodeUser() {
        return codeUser;
    }

    public void setCodeUser(String codeUser) {
        this.codeUser = codeUser;
    }

    /**
     * @return Detailed name information.
     */
    public String getNameZhUser() {
        return nameZhUser;
    }

    public void setNameZhUser(String nameZhUser) {
        this.nameZhUser = nameZhUser;
    }

    /**
     * @return Detailed email information.
     */

    public String getEmailUser() {
        return emailUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    /**
     * @return Detailed password information.
     */
    public String getPwdUser() {
        return pwdUser;
    }

    public void setPwdUser(String pwdUser) {
        this.pwdUser = pwdUser;
    }


    /**
     * @return Detailed phone information.
     */
    public String getPhoneUser() {
        return phoneUser;
    }

    public void setPhoneUser(String phoneUser) {
        this.phoneUser = phoneUser;
    }

    /**
     * @return Detailed tel information.
     */
    public String getTelUser() {
        return telUser;
    }

    public void setTelUser(String telUser) {
        this.telUser = telUser;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codeUser == null) ? 0 : codeUser.hashCode());
        result = prime * result + ((nameZhUser == null) ? 0 : nameZhUser.hashCode());
        result = prime * result + ((emailUser == null) ? 0 : emailUser.hashCode());
        result = prime * result + ((phoneUser == null) ? 0 : phoneUser.hashCode());
        result = prime * result + ((pwdUser == null) ? 0 : pwdUser.hashCode());
        result = prime * result + ((telUser == null) ? 0 : telUser.hashCode());

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        UserInfo other = (UserInfo) obj;
        if (emailUser == null) {
            if (other.emailUser != null) {
                return false;
            }
        } else if (!emailUser.equals(other.emailUser)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        String result = "";
        ObjectMapper mapper = JacksonFactory.getMapperInstance(false);
        try {
            result = mapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return result;
    }
}
