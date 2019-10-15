package com.amhi.practice.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

public class BulkUsers {

    @NotNull
    @Size(min = 2)
    private List<Long> usersIds;

    public List<Long> getUsersIds() {
        return usersIds;
    }

    public void setUsersIds(List<Long> usersIds) {
        this.usersIds = usersIds;
    }


}
