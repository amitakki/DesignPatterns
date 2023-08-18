package com.designpatterns.structural.proxy;

// Proxy
public class ProxyInternetAccess implements InternetAccess {
    private InternetAccess realInternetAccess;
    private static final String[] RESTRICTED_WEBSITES = {"facebook.com", "twitter.com"};

    @Override
    public void connectTo(String website) {
        if (isWebsiteRestricted(website)) {
            System.out.println("Access to " + website + " denied. Restricted website.");
        } else {
            getRealInternetAccess().connectTo(website);
        }
    }

    private InternetAccess getRealInternetAccess() {
        if (realInternetAccess == null) {
            realInternetAccess = new RealInternetAccess();
        }
        return realInternetAccess;
    }

    private boolean isWebsiteRestricted(String website) {
        for (String restrictedWebsite : RESTRICTED_WEBSITES) {
            if (website.equalsIgnoreCase(restrictedWebsite)) {
                return true;
            }
        }
        return false;
    }
}
