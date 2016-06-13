package services.utils.verify.check;

import com.jayway.jsonpath.JsonPath;
import models.apis.custom.CheckMethod;
import models.apis.custom.Check;
import net.sf.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by apple on 16/5/9.
 */
public class CheckRuleImpl {

    private Check check;

    public Check getCheck() {
        return check;
    }

    public void setCheck(Check check) {
        this.check = check;
    }

    public CheckRuleImpl(){}

    public CheckRuleImpl(Check check){
        this.check = check;
    }

    public void getResult(String response){
        String fieldName = check.getField();
        List list = new ArrayList<>();
        try{
            JSONObject jsonObject = JSONObject.fromObject(response);
            list = JsonPath.read(response, "$.."+fieldName);
        }catch (Exception e){
            list.add(response);
        }

        if(check.getCheckMethod().equals(CheckMethod.Save)){
            if(list.size()==0){
                check.setExpect("");
            }else{
                check.setExpect(list.get((int)(Math.random()*list.size())).toString());
            }
        }else if(check.getCheckMethod().equals(CheckMethod.Contain)){
            for(int i=0;i<list.size();i++){
                if(list.get(i).toString().contains(check.getExpect())){
                    check.setStatus("OK");
                }else{
                    check.setStatus("KO");
                }
            }

        }else if(check.getCheckMethod().equals(CheckMethod.IsNotContain)){
            for(int i=0;i<list.size();i++){
                if(list.get(i).toString().contains(check.getExpect())){
                    check.setStatus("KO");
                }else{
                    check.setStatus("OK");
                }
            }

        }else if(check.getCheckMethod().equals(CheckMethod.Equal)){
            for(int i=0;i<list.size();i++){
                if(list.get(i).toString().equals(check.getExpect())){
                    check.setStatus("OK");
                }else{
                    check.setStatus("KO");
                }
            }

        }else if(check.getCheckMethod().equals(CheckMethod.IsNull)){
            for(int i=0;i<list.size();i++){
                if(list.get(i) == null){
                    check.setStatus("OK");
                }else{
                    check.setStatus("KO");
                }
            }

        }else if(check.getCheckMethod().equals(CheckMethod.HasItem)){
            if(list.size()==0){
                check.setStatus("KO");
            }else{
                check.setStatus("OK");
            }

        }else if(check.getCheckMethod().equals(CheckMethod.DoNotHasItem)){
            if(list.size()==0){
                check.setStatus("OK");
            }else{
                check.setStatus("KO");
            }
        }
    }
}
