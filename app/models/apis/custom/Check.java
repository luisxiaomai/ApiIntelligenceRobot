package models.apis.custom;

/**
 * Created by apple on 16/5/18.
 */
public class Check {

    protected CheckMethod checkMethod;

    protected String field;

    protected String targetField;

    protected String expect;

    protected String status;

    public Check(){}

    public Check(String field, String targetField, String expect){
        this.field = field;
        this.targetField = targetField;
        this.expect = expect;

    }

    public String getTargetField() {
        return targetField;
    }

    public void setTargetField(String targetField) {
        this.targetField = targetField;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getExpect() {
        return expect;
    }

    public void setExpect(String expect) {
        this.expect = expect;
    }

    public CheckMethod getCheckMethod() {
        return checkMethod;
    }

    public void setCheckMethod(CheckMethod checkMethod) {
        this.checkMethod = checkMethod;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((field == null) ? 0 : field.hashCode());
        result = prime * result + ((targetField == null) ? 0 : targetField.hashCode());
        result = prime * result + ((expect == null) ? 0 : expect.hashCode());
        result = prime * result + ((checkMethod == null) ? 0 : checkMethod.hashCode());
        result = prime * result + ((status == null) ? 0 : status.hashCode());

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
        Check other = (Check) obj;
        if (field == null) {
            if (other.field != null) {
                return false;
            }
        } else if (!field.equals(other.field)) {
            return false;
        }
        if (targetField == null) {
            if (other.targetField != null) {
                return false;
            }
        } else if (!targetField.equals(other.targetField)) {
            return false;
        }
        if (expect == null) {
            if (other.expect != null) {
                return false;
            }
        } else if (!expect.equals(other.expect)) {
            return false;
        }

        if (checkMethod == null) {
            if (other.checkMethod != null) {
                return false;
            }
        } else if (!checkMethod.equals(other.checkMethod)) {
            return false;
        }

        if (status == null) {
            if (other.status != null) {
                return false;
            }
        } else if (!status.equals(other.status)) {
            return false;
        }

        return true;
    }
}
