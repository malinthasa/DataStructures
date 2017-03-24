package com.malintha.datastructures.collections;

import javax.print.DocFlavor;

/**
 * Created by malintha on 3/24/17.
 */
public class MobileCustomer {
    private String id;
    private String serviceProvider;

    public MobileCustomer(String id, String serviceProvider){
        this.id = id;
        this.serviceProvider = serviceProvider;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setServiceProvider(String serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    public String getId() {
        return id;
    }

    public String getServiceProvider() {
        return serviceProvider;
    }
}
