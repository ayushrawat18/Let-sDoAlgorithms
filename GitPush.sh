echo "Branch name : $1"; 
echo "Checkin message : $2";

git stash 
git checkout main
git pull --rebase
echo "Creating branch : $1"
git checkout -b "scratch/$1"
git stash pop
git add *
git commit -m "$2"
git push 

