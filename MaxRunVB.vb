'****************************************************************************
'
' Created by: Chris Karpinski
' Created on: Sept 2016
' This program calculates the maximum run of consecutive characters in a
'     given string
'
'****************************************************************************

Module MaxRun

    Sub Main()

        Dim charCount As Int32 = 1
        Dim maxCount As Int32 = 1
        Dim enteredString As String
        Dim wantContinue As String = "Y"

        While (wantContinue = "Y")
            'this while loop loops the program while the user wants to continue
            Console.WriteLine("Enter the string")
            enteredString = Console.ReadLine()

            For index As Integer = 1 To enteredString.Length - 2
                'this for loop loops through all characters in the string
                If (enteredString.Chars(index) = enteredString.Chars(index + 1)) Then
                    'this if statement checks if the next character is the same as the current
                    charCount = charCount + 1

                    If (charCount > maxCount) Then
                        ' setting the max count to the running count if the running count is greater
                        maxCount = charCount
                    End If
                Else
                    'reset the running count if the consecutive run of a character ends
                    charCount = 1
                End If

            Next

            Console.WriteLine("The max running length in the string is: " + maxCount.ToString)
            Console.WriteLine("Would you like to continue? (enter Y or N)")

            wantContinue = Console.ReadLine()


            While (Not (wantContinue = "Y" Or wantContinue = "N"))
                'makes sure user enters valid option for continuation
                Console.WriteLine("Invalid option entered")
                Console.WriteLine("Would you like to continue? (enter Y or N)")
                wantContinue = Console.ReadLine()
            End While

            'reset the max count back to start at 1
            maxCount = 1

            If (wantContinue = "N") Then
                'finishes the program (and closes it) if continuation is not wanted
                Console.WriteLine("")
                Console.WriteLine("Done.")
            End If
        End While
    End Sub

End Module
