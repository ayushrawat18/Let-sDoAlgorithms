git stash 
git checkout main
git stash pop
git checkout -b "scratch/dsalgo"
git add *
git commit -m "$1 "
git push 