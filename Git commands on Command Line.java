==================Git commands on Command Line==================

git clone URL/projectname.git 			==> To Clone Remote Repository to Current Local Repository

TO See hidden files in MAC: Command + Shift + .
				   Windows: 

git branch 								==> To see all local branches

git branch -a 							==> To see all branches including remote 

git diff								==>To see differences/changes on the code

git status								==>To see files in working dir, that are not pushed yet

git add -A  (adds all files)			==>To add files to Staging area: git add -A  (adds all files)
git add fileName (adds one file)

git rm -r --cached fileName				==>To remove files from Staging area

git commit -m "message"					==>To commit

git pull origin master					==>To pull(Get new codes from Remote)

git push branchName						==>To push codes to Remote Repository

git branchName -a						==>To see all existing branches

git branch branchName					==>To create a new branch

git checkout branchName					==>To switch to branch

git branch -d branchName				==>To delete a local branch

git push origin --delete branchName		==>To delete a remote branch

git push -u origin branchName			==>To push always to one branch:   //so, next time you just do: git push
git pull -u origin branchName			==>To pull always from one branch  //so, next time you just do: git pull


		
		==>To make a pull request from one branch to Master branch:

				1. git checkout Master 			==switching to master branch
				2. git pull origin Master       ==pulling latest code
				3. git branch --merged			==see merged branches
				4. git merger branchName		==to merge branch
				5. git push origin Master       ==To push to master



To Ignore some files while commiting: 

				1. Crete file in your project: .gitignore  (type when creating file: .gitignore.)

				2. add extensions of files that you want to ignore to .gitignore file 
													
						1   FileName 		= to ignore specific file

						2   .txt			= to ignore every file that contains .txt extension

						3	video.*			= to ignore all files containing "video" in thire title

						4	video*			= will ignore all files starting with "video"

						5	folderName/*    =*/will ignore all files that are inside this folder

						6   !				= not ignore




										
