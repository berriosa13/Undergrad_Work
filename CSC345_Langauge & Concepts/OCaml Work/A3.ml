(* CSC 345 Assignment #3
   On my honor, <Anthony Berrios>, this assignment is my own work and I have not shared my solution with anyone. *)
 
 
(* 1. Write a function opp that returns the boolean complement (opposite) of its argument.  
      For example, opp (1 = 2);; returns true *)	  
let opp : bool -> bool = fun x -> if x then false else true;;


(* 2. Write a function dividesEvenlyByFive that returns whether some dividend is evenly divisible by the divisor 5.
      For example, dividesEvenlyByFive 10;; returns true *)
let dividesEvenlyByFive : int -> bool = fun x -> if (x mod 5) = 0 then true else false;;


(* 3. Write a function middle that returns the second greatest of three given arguments.
      For example, middle 1 2 3;; returns 2 *)	  
let middle : 'a -> 'a -> 'a -> 'a = fun x y z -> if (x > y && x < z) || (x < y && x > z) then x else if (y > x && y < z) || (y < x && y > z) then y else z;; 


(* 4. Write a function nor that computes the NOR gate of two boolean arguments.  (Look up " NOR gate" if you do not know what it is.)
      For example, nor (1=2) (2=3);; returns true *)
let nor : bool -> bool -> bool = fun x y -> not(x||y);;


(* 5. Write a function triangleArea that computers the area of a triangle given its base and height. 
      For example, triangleArea 2 3;; returns 3 *)
let triangleArea : int -> int -> float = fun x y -> float (x * y) /. 2.0;;


(* 6. Write a function ceilingDecimal that calculates the ceiling of a float, but returns it as an int rather than a float. 
      For example, ceilingDecimal 15.1;; returns 16 *)
let ceilingDecimal : float -> int = fun x -> (int_of_float (ceil x));;;;

(* 7. Write a function letterGrade that returns the equivalent letter grade for a given numerical integer grade below.

		Letter Grade	Numerical Grade
		A				93-100
		A-				90-92
		B+				87-89
		B				83-86
		B-				80-82
		C+				77-79
		C				73-76
		C-				70-72
		D+				67-69
		D				63-66
		D-				60-62
		F				< 60%

      For example, letterGrade 91;; returns A- *)
let letterGrade : int -> string = fun x -> if (x >= 93 && x <= 100) then "A"
else if (x >= 92 && x <= 90) then "A-"
else if (x >= 87 && x <= 89) then "B+"
else if (x >= 83 && x <= 86) then "B" 
else if (x >= 80 && x <= 82) then "B-" 
else if (x >= 77 && x <= 79) then "C+" 
else if (x >= 73 && x <= 76) then "C" 
else if (x >= 70 && x <= 72) then "C-" 
else if (x >= 67 && x <= 69) then "D+" 
else if (x >= 63 && x <= 66) then "D" 
else if (x >= 60 && x <= 62) then "D-" 
else "F";;


(* 8. Write a function averageThree to return the average of three integers. 
      For example, averageThree (-1) 1 2;; returns 0.66666666666666663 *)
let averageThree : int -> int -> int -> float = fun x y z -> float(x + y + z) /. 3.0;;


(* 9. Write a function howManyAboveAverage that returns how many of three integer inputs are above its average value.  
      For example, howManyAboveAverage 1 3 3;; returns 2 *)
let howManyAboveAverage : int -> int -> int -> int = fun x y z ->  let sum = (x + y + z) / 3 in 
  if  (x  >= sum && y >= sum && z >= sum) then 3
  else if (x  >= sum && y >= sum) || (x  >= sum && z >= sum) || (y >= sum && z >= sum) then 2
  else if (x >= sum) || (y >= sum) || (z >= sum) then 1
  else 0 ;;


(* 10. Write a function howManyWithinThreshold that returns how many of the first three arguments are within the threshold (the fourth argument) of the average of the first three arguments. 
       For example, howManyWithinThreshold 10 1 2 3.5;; returns 2 *)
let howManyWithinThreshold : int -> int -> int -> float -> int = fun x y z t -> if (float x < t && float y < t && float z < t) then 3
else if (float x < t && float y < t) || (float x < t && float z < t) || (float y < t && float z < t) then 2
else if (float x < t || float y < t || float z < t) then 1
else 0;;

