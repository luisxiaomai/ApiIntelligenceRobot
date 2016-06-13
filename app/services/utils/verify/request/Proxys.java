package services.utils.verify.request;

import models.apis.custom.Proxy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by apple on 16/6/12.
 */
public class Proxys {

    public Map<String, Proxy> getProxys() {
        return proxys;
    }

    public void setProxys(Map<String, Proxy> proxys) {
        this.proxys = proxys;
    }

    protected   Map<String,Proxy> proxys = new HashMap<>();

    public Proxys(){
        proxys.put("host",new Proxy("host",8080,"",""));
    }

}
