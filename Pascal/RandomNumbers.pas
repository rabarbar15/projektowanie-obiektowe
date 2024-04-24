program SimpleForLoop;


procedure GenerateRandomNumbers(var arr: array of integer; fromValue, toValue, count: integer);
var
  i, randomNumber: integer;
begin
  
  for i := 1 to count do
  begin
    randomNumber := Random(toValue - fromValue + 1) + fromValue;
    arr[i] := randomNumber;
    
  end;
end;

procedure Sorting(var arr: array of integer);
var
  i, j, temp: integer;
begin
  for i := Low(arr) to High(arr) - 1 do
  begin
    for j := Low(arr) to High(arr) - 1 do
    begin
      if arr[j] > arr[j + 1] then
      begin
        temp := arr[j];
        arr[j] := arr[j + 1];
        arr[j + 1] := temp;
      end;
    end;
  end;
end;

procedure DisplayNumbers(arr: array of integer);
var
  j: integer;
begin
  
  for j := Low(arr) to High(arr) do
  begin
    Write(arr[j], ' ');
  end;
   Writeln();
end;

Var 
  arr: array Of integer;
  size: integer = 50;
begin
    Randomize;
    SetLength(arr, size);
    
    GenerateRandomNumbers(arr, 100, 200, 50);
    writeln('Wygenerowana liczby:');
    DisplayNumbers(arr);
    
    Sorting(arr);
    Writeln('Po sortowaniu:');
    DisplayNumbers(arr);
end.
