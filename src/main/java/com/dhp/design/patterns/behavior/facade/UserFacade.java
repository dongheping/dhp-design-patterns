package com.dhp.design.patterns.behavior.facade;

import com.dhp.design.patterns.behavior.facade.subsystem.SubSystem1;
import com.dhp.design.patterns.behavior.facade.subsystem.SubSystem2;
import com.dhp.design.patterns.behavior.facade.subsystem.SubSystem3;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class UserFacade implements Facade {

    private SubSystem1 subSystem1;
    private SubSystem2 subSystem2;
    private SubSystem3 subSystem3;

    @Override
    public void print(){
        subSystem1.print();
        subSystem2.print();
        subSystem3.print();
    }
}
