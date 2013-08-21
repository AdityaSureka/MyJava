import java.io.*;
class stack
{
int new stack[];
int capacity;
int top;
stack()
{
stk=new int[200];
}
stack(int cap)
{
capcity=cap;
top=-1;
}
int push(int n)
{
stack[top]=n;

