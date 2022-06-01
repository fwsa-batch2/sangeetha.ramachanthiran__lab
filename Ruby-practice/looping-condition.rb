def looping
    array_name = [12,13,14,15,16]
    len = array_name.length
    for i in 1..len do
        puts "Welcome #{i}"
    end
end
looping

def foreach_prac
    num = [1,2,3,4,5,6]
    num.each do
        puts "hello"
    end
end
foreach_prac

def while_loop
    print "Type any number : "
    input = gets.to_i
    while input = 5 do
        puts "I am while loop"
        i++
    end
end
while_loop

def do_while
    loop do
        puts "Checking for answer"   
        answer = gets.chomp   
        if answer != '5'   
            break   
        end   
    end
end
do_while