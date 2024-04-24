program SimpleForLoop;


procedure GenerateRandomNumbers(var arr: array of integer);
var
  i, randomNumber: integer;
begin

  for i := 1 to 50 do
  begin
    randomNumber := Random(100 + 1);
    arr[i] := randomNumber;
    WriteLn(arr[i], ' ');
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

var
  arr: array of integer;
  i: integer;
begin
    SetLength(arr, 50);
    Randomize;
    GenerateRandomNumbers(arr);
    WriteLn('Po sortowaniu: ');
    Sorting(arr);

    for i := Low(arr) to High(arr) do
        WriteLn(arr[i], ' ');
end.
