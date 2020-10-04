package com.dhp.design.patterns.behavior.facade;

import com.dhp.design.patterns.behavior.facade.subsystem.SubSystem1;
import com.dhp.design.patterns.behavior.facade.subsystem.SubSystem2;
import com.dhp.design.patterns.behavior.facade.subsystem.SubSystem3;

public class FacadeTest {

    public static void main(String[] args) {
        Facade userFacade = new UserFacade(new SubSystem1(),new SubSystem2(),new SubSystem3());
        userFacade.print();
        Facade memberFacade = new MemberFacade(new SubSystem1(),new SubSystem2());
        memberFacade.print();
    }
}
