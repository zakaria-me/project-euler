term1 = 1
term2 = 2
sum = 0

while term1 < 4 * (10 ** 6) && term2 < 4 * (10 ** 6) do
  if term2 % 2 == 0
    sum += term2
  end
      temp = term2
  term2 += term1
  term1 = temp
end


puts  this

puts sum