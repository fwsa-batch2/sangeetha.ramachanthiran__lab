class VariablePractice
    # global variable -- access inside and outside the class.
    $list = "StudentList"
    # class variables -- access inside the class.
    @@office_name = "Freshworks"
    def var_method
        # instance variable -- declared inside the method, accessed inside the class.
        @student_name = "Sangeetha"
        # local variable -- accessed within a method.
        salary = 10000
        _age = 18
        puts @student_name
        puts _age
        puts salary
        puts @@office_name
        puts $list
    end
    def meth
        puts @student_name
    end
    puts @@office_name
end
obj = VariablePractice.new
obj.var_method
obj.meth
puts $list
