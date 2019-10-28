﻿/*
 * 도형의 모양뿐만 아니라 턴의 모양을 모두 가진다.
 */
package my_tetris;

public class Shape {
    
    //모든 블럭들의 종류와 턴의 모양을 배열로 저장해 둔다.
    static final int[][][][] SHAPE = {
        {// ㄱ
            { // 각도 0
                {0,1,1,0},
                {0,0,1,0},
                {0,0,1,0},
                {0,0,0,0}
            },{//90도
                {0,0,0,1},
                {0,1,1,1},
                {0,0,0,0},
                {0,0,0,0}
            },{//180도
                {0,0,1,0},
                {0,0,1,0},
                {0,0,1,1},
                {0,0,0,0}
            },{//270도
                {0,0,0,0},
                {0,1,1,1},
                {0,1,0,0},
                {0,0,0,0}
            }
        },{// ㅁ
            {
                {0,0,0,0},
                {0,1,1,0},
                {0,1,1,0},
                {0,0,0,0}
            },{
                {0,0,0,0},
                {0,1,1,0},
                {0,1,1,0},
                {0,0,0,0}
            },{
                {0,0,0,0},
                {0,1,1,0},
                {0,1,1,0},
                {0,0,0,0}
            },{
                {0,0,0,0},
                {0,1,1,0},
                {0,1,1,0},
                {0,0,0,0}
            }
        },{// ㅡ
            {
                {0,0,0,0},
                {0,0,0,0},
                {1,1,1,1},
                {0,0,0,0}
            },{
                {0,1,0,0},
                {0,1,0,0},
                {0,1,0,0},
                {0,1,0,0}
            },{
                {0,0,0,0},
                {0,0,0,0},
                {1,1,1,1},
                {0,0,0,0}
            },{
                {0,1,0,0},
                {0,1,0,0},
                {0,1,0,0},
                {0,1,0,0}
            }
        },{// -_
            {
                {0,0,0,0},
                {1,1,0,0},
                {0,1,1,0},
                {0,0,0,0}
            },{
                {0,0,0,0},
                {0,0,1,0},
                {0,1,1,0},
                {0,1,0,0}
            },{
                {0,0,0,0},
                {1,1,0,0},
                {0,1,1,0},
                {0,0,0,0}
            },{
                {0,0,0,0},
                {0,0,1,0},
                {0,1,1,0},
                {0,1,0,0}
            }
        },{// _-
            {
                {0,0,0,0},
                {0,1,1,0},
                {1,1,0,0},
                {0,0,0,0}
            },{
                {0,0,0,0},
                {1,0,0,0},
                {1,1,0,0},
                {0,1,0,0}
            },{
                {0,0,0,0},
                {0,1,1,0},
                {1,1,0,0},
                {0,0,0,0}
            },{
                {0,0,0,0},
                {1,0,0,0},
                {1,1,0,0},
                {0,1,0,0}
            }
        },{// ㄴ
            {
                {0,0,0,0},
                {1,0,0,0},
                {1,1,1,0},
                {0,0,0,0}
            },{
                {0,0,0,0},
                {0,1,1,0},
                {0,1,0,0},
                {0,1,0,0}
            },{
                {0,0,0,0},
                {0,0,0,0},
                {1,1,1,0},
                {0,0,1,0}
            },{
                {0,0,0,0},
                {0,1,0,0},
                {0,1,0,0},
                {1,1,0,0}
            }
        },{ // ㅗ
            {
                {0,0,0,0},
                {0,1,0,0},
                {1,1,1,0},
                {0,0,0,0}
            },{
                {0,0,0,0},
                {0,1,0,0},
                {0,1,1,0},
                {0,1,0,0}
            },{
                {0,0,0,0},
                {0,0,0,0},
                {1,1,1,0},
                {0,1,0,0}
            },{
                {0,0,0,0},
                {0,1,0,0},
                {1,1,0,0},
                {0,1,0,0}
            }
        }
    };
}
