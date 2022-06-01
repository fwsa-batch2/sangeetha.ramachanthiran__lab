class Param_func
    def my_func(input_1,input_2)
        output = input_1 + input_2
        puts output
    end
end
cls_obj = Param_func.new
cls_obj.my_func(23,45)