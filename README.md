# TDD Mars Rovers
## Requirement
A squad of robotic rovers are to be landed by NASA on a plateau 
on Mars. This plateau, which is curiously rectangular, must be 
navigated by the rovers so that their on-board cameras can get 
a complete view of the surrounding terrain to send back to Earth.
A rover’s position and location is represented by a combination 
of x and y co-ordinates and a letter representing one of the four 
cardinal compass points. The plateau is divided up into a grid to 
simplify navigation. An example position might be 0, 0, N, which 
means the rover is in the bottom left corner and facing North. 
In order to control a rover, NASA sends a simple string of letters. 
The possible letters are ‘L’, ‘R’ and ‘M’. ‘L’ and ‘R’ makes the 
rover spin 90 degrees left or right respectively, without moving 
from its current spot. ‘M’ means move forward one grid point, and 
maintain the same heading. Assume that the square directly North 
from (x, y) is (x, y+1).
## input
INPUT:
The first line of input is the upper-right coordinates of the plateau, 
the lower-left coordinates are assumed to be 0,0. The rest of the input 
is information pertaining to the rovers that have been deployed. Each 
rover has two lines of input. The first line gives the rover’s position, 
and the second line is a series of instructions telling the rover how to 
explore the plateau. The position is made up of two integers and a letter
separated by spaces, corresponding to the x and y co-ordinates and the 
rover’s orientation. Each rover will be finished sequentially, which means 
that the second rover won’t start to move until the first one has finished 
moving.
## output
The output for each rover should be its final co-ordinates and heading.

## Demand split
    1.需要拆分成2个部分，一个火星车对象，一个火星车控制类，其中火星的范围由之前类变成的静态资源
    2.火星车对象可以接受参数，进行初始化位置和朝向
    3.火星车可以接受参数来转向和移动
    4.判断火星车位置是否合法（是否在边界范围内）
    5.判断火星车指令是否合法
    6.将合法的火星车数据存入火星车对象中，并加入到火星车集合中进行输出