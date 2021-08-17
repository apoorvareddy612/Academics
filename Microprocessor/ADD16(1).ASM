data segment
n1 dw 4343h
n2 dw 1111h
res dw ?

data ends

code segment
assume cs: code, ds:data
start:
      mov ax,data
      mov ds,ax
      mov ax,n1
      mov bx,n2
      add ax,bx
      mov res,ax
      int 21h

      code ends
      end start
