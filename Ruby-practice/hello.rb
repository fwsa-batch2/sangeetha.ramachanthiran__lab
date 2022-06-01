class Welcome 
    def printing_method
        name = "Sangee"
        puts name
        puts "hello world"
        print "To print something "
        puts "Welcome to Ruby" 
        print "Not printed"   
    end
end
obj_name = Welcome.new # Creating object for a class
obj_name.printing_method # calling the method name 
