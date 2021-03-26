import Student.ClassONE;
import Student.Classroom;

module ModuleOne {
    //导出模块的方法
    exports Student;
    exports Teacher;

    provides Classroom with ClassONE; //Classroom接口的ClassONE实现类提供服务
}