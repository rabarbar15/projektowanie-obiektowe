program SimpleForLoop;


procedure GenerateRandomNumbers();
var
  i, randomNumber: integer;
  arr: array Of integer;
begin
  SetLength(arr, 50);

  for i := 1 to 50 do
  begin
    randomNumber := Random(100 + 1);
    arr[i] := randomNumber;
    WriteLn(arr[i], ' ');
  end;
end;

begin
    Randomize;
    GenerateRandomNumbers();
end.
