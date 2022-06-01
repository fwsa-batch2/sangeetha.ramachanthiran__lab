class  Condition_practice
    print "input : "
    num = gets
    emp = num.to_i
    # puts emp
       if emp < 50
           puts "#{emp} is less than 50"
       elsif emp == 50
            puts "#{emp} is equal to 50"
       else
            puts "#{emp} is greater than 50"
       end
end