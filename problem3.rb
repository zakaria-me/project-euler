require "pry"
print "The number considered: "
number = gets.chomp.to_i

i = 2
prime_numbers = []
while i < number do
  if [2,3,5,7].include?(i) || ([2,3,4,5,6,7,8,9]+prime_numbers).all? {|digit| i % digit != 0 }
    prime_numbers.push(i)  
  end
  i += 1
end


i=0
prime_factors = []
# while number is not prime
while !(([2,3,4,5,6,7,8,9]+prime_numbers).all? {|digit| number % digit == 0 }) || ![1,2,3,5,7].include?(number) do
  # if number is not a multiple of the current prime, pass to the next number
  if number % prime_numbers[i] == 0
    # binding.pry
    number /= prime_numbers[i]
    prime_factors.push(prime_numbers[i])
  elsif number % prime_numbers[i] != 0 && (([2,3,4,5,6,7,8,9]+prime_numbers).all? {|digit| number % digit == 0 } || ![2,3,5,7].include?(number)) 
    i += 1
  end
end

puts prime_factors.to_a
