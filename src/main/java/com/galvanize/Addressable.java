package com.galvanize;

import java.util.List;

/**
 * Created by subashri.sankara on 3/13/2017.
 */
public interface Addressable {
    List<Address> getAddresses();
    void addAddress(Address address);
}
