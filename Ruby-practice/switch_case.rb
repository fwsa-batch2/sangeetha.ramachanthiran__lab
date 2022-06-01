def case_func
    print "Age : "
    age = gets.to_i
    # puts fruit_color
    case age  
    when 0..17
        puts "Not eligible"
    when 18..21
        puts "Eligible"
    else
        puts "over age"
    end
end
case_func