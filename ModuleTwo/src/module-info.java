import Student.ClassONE;
import Student.Classroom;

module ModuleTwo {
    //接收模块
    requires ModuleOne;

    uses Classroom;  //接受接口
}