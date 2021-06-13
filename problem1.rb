sum = 0

for i in 1..999 do
  if i % 5 == 0 || i % 3 == 0 then
    # puts " #{i} : multiple de 3 ou 5"
    sum += i
  end
end

puts sum