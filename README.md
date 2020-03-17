"# Android_Recycler_View" 
Recycler view implementation and brief

Recycler view is used to display large data set in a limited window
It recycles the view which are sent out of the screen and binds new data to them


There are 4 Components to RecyclerView
	RecyclerView.Adapter
	RecyclerView.LayoutManager
	RecyclerView.ItemAnimator
	RecyclerView.ViewHolder
	
RecyclerView.Adapter

 A adapter picks up data from a data set and pass it on to LayoutManager     
 which further present it to the user.

RecyclerView.ViewHolder

Each view is attatched with a ViewHolder.It helps in reducing the number of View Creation.

RecyclerView.LayoutManager

It arranges the views on the screen 
